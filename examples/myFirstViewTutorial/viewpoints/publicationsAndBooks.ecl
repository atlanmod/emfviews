//alias_publication=../metamodels/Publication.ecore
//alias_book=../metamodels/Book.ecore

rule book
match p : publication!Publication
with  b : book!Book
{
	compare
	{
		return p.title = b.title;
	}
}

rule chapter
match ps : publication!PubSection
with c : book!Chapter
{
	compare
	{
		return ps.title = c.title and ps.nPages >20 and not ps.isTOC;
	}
}