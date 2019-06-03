rule detailedProcess
match s : cfw!Process
with  t : bpmn!bpmn2::Process
{
	compare
	{
		return s.name = t.name;
	}
}

rule detailedRequirement
match s : cfw!Requirement
with  t : reqif!SpecObject
{
	compare
	{
		return t.values.exists(v | v.theValue=s.name);
	}
}
