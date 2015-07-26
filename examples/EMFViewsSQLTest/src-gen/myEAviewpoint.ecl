//alias_togaf=http://www.obeonetwork.org/dsl/togaf/contentfwk/9.0.0
//alias_bpmn=http://www.omg.org/spec/BPMN/20100524/MODEL-XMI
//alias_reqif=http://www.omg.org/spec/ReqIF/20110401/reqif.xsd

rule detailedProcess
match s : togaf!Process
with  t : bpmn!Process
{
	compare
	{
		return s.name = t.name;
	}
}

rule detailedRequirement
match s : togaf!Requirement
with  t : reqif!SpecObject
{
	compare
	{
		return t.values.exists(v | v.theValue=s.name);
	}
}


