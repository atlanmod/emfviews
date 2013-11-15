import "createLinksModel.eol";

rule MatchProcessWithProcess
match s : teap!Process
with  t : teap!Process
{
	compare
	{
		return s.name = t.name;
	}
}

//post processMatchTrace
//{

	//var newLinksModel = new Native("org.eclipse.epsilon.emc.emf.EmfModel");

	//createLinksModel();

	//'There are: ' + matchTrace.getMatches().size() + ' elements'.println();
	//for (i in matchTrace.getMatches()) 
	//{
		//i.matching.println(); 
		
	//}
	
//}
