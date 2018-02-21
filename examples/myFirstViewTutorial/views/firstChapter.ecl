//alias_publication=http://publication
//alias_book=http://book

rule bookChapters
match p : publication!Publication
with  c : book!Chapter
{
  compare
  {
    return p.title = c.eContainer().title and c = c.eContainer().eContents().first();
  }
}
