// src/main/scala/TypeLessDoMore/method-broad-inference-return.sc
// ERROR: Won't compile. Method actually returns List[Any], which is too "broad".

def makeList(strings: String*) = {
  if (strings.length == 0)
    List(0)  // #1
  else
    strings.toList
}

val list: List[String] = makeList()  // ERROR