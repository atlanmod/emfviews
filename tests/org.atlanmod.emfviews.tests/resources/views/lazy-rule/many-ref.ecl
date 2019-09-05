rule manyB
match left:  A!A
with  right: B!B
{
  compare {
    return true;
  }
}
