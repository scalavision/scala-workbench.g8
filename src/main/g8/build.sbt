// give the user a nice default project!
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "$organization$",
      scalaVersion := "2.12.2",
      libraryDependencies ++= Seq(
         "org.specs2"           %% "specs2-core"        % "$scalaspecversion$"
        ,"com.lihaoyi"          %% "sourcecode"         % "$sourcode_version$"
        ,"com.lihaoyi"          %% "pprint"             % "$pprint_version$"
        ,"com.lihaoyi"          %% "fastparse"          % "$fastparse_version$"
        ,"org.typelevel"        %% "cats"               % "$cats_version$"
        ,"co.fs2"               %% "fs2-core"           % "$fs2_core_version$"
        ,"co.fs2"               %% "fs2-io"             % "$fs2_io_version$"
        ,"com.github.pathikrit" %% "better-files"       % "$better_files_version$"
      )
    )),
    name := "$name$"
  )
