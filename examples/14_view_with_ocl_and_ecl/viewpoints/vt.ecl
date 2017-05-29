//alias_bpmn=http://www.omg.org/spec/BPMN/20100524/MODEL-XMI
//alias_reqif=http://www.omg.org/spec/ReqIF/20110401/reqif.xsd
//alias_teap=http://www.obeonetwork.org/dsl/togaf/contentfwk/9.0.0
//alias_uml=http://www.eclipse.org/uml2/4.0.0/UML

rule MatchProcessWithProcess
match s : teap!Process
with  t : bpmn!Process
{
	compare
	{
		return s.name = t.name;
	}
}

rule requirement2reqif
match s : teap!Requirement
with  t : reqif!SpecObject
{
	compare
	{
		return t.values.exists(v | v.theValue=s.name);
	}
}

rule dataEntity2umlClass
match s: teap!DataEntity
with t: uml!Class
{
	compare
	{
		return t.getappliedstereotypes()->exists(st|st.name='Embeddable') and s.name = t.name;
	}
}