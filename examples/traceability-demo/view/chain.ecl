//alias_uml=http://www.eclipse.org/uml2/5.0.0/UML
//alias_java=http://www.eclipse.org/MoDisco/Java/0.2.incubation/java
//alias_trace=http://trace
//alias_reqif=http://www.omg.org/spec/ReqIF/20110401/reqif.xsd

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
