# Scala + SBT + LWJGL

This is a minimal setup required to start using lwjgl with scala and sbt. The one thing this project really helps with
is managing native libraries with sbt, instead of downloading them yourself.

There's also a HelloWorld example in sources, so you can just do `sbt run` to test if your setup works.

I recommend checking out the `build.sbt` to see exactly how the native libraries are included and then making your own
project from scratch, unless you'd like to use my basic platform detection algorithm.