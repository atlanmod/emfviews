//~~~~~~~~~~~~~~
// Trace -> Java

rule javaClass
match l : trace!Log
with  c : java!ClassDeclaration
{
  compare
  {
    return l.source.split("\\.")[0] = c.name;
  }
}

//~~~~~~~~~~~~
// Java -> UML

rule component
match p : java!Package
with  c : uml!Component
{
  compare
  {
    return p.name = c.name.toLowerCase();
  }
}

//~~~~~~~~~~~~~~~~~~~~
// UML -> Requirements

rule requirements
match c : uml!Component
with  r : reqif!SpecObject
{
  compare
  {
    return c.name.toLowerCase().isSubstringOf(r.values[0].theValue.toLowerCase());
  }
}
