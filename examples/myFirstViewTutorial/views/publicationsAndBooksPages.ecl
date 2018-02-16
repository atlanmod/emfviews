//alias_publication=http://publication/1.0
//alias_book=http://book/1.0

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
		return ps.title = c.title and ps.nPages > 20;
	}
}