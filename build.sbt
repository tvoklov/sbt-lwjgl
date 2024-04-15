ThisBuild / version := "template"

ThisBuild / scalaVersion := "3.3.3"

lazy val lwjglVersion = "3.3.3"

// this is not perfect, i included it to make setting up and running things as easy as possible
// biggest issue: this doesn't account for any architecture other than x64
lazy val lwjglNativesPlatform = {
  System.getProperty("os.name").toLowerCase match {
    case mac if mac.contains("mac") =>
      "macos"
    case win if win.contains("win") =>
      "windows"
    case linux =>
      "linux"
  }
}

lazy val lwjglNativesString = s"natives-$lwjglNativesPlatform"

lazy val root = (project in file("."))
  .settings(
    name := "example-project",
    libraryDependencies ++= Seq(
      "org.lwjgl" % "lwjgl" % "3.3.3",
      "org.lwjgl" % "lwjgl-assimp" % "3.3.3",
      "org.lwjgl" % "lwjgl-glfw" % "3.3.3",
      "org.lwjgl" % "lwjgl-openal" % "3.3.3",
      "org.lwjgl" % "lwjgl-opengl" % "3.3.3",
      "org.lwjgl" % "lwjgl-stb" % "3.3.3",
      "org.lwjgl" % "lwjgl" % "3.3.3" classifier lwjglNativesString,
      "org.lwjgl" % "lwjgl-assimp" % "3.3.3" classifier lwjglNativesString,
      "org.lwjgl" % "lwjgl-glfw" % "3.3.3" classifier lwjglNativesString,
      "org.lwjgl" % "lwjgl-openal" % "3.3.3" classifier lwjglNativesString,
      "org.lwjgl" % "lwjgl-opengl" % "3.3.3" classifier lwjglNativesString,
      "org.lwjgl" % "lwjgl-stb" % "3.3.3" classifier lwjglNativesString
    )
  )
