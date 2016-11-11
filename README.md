My [Giter8][g8] template for [finatra][finatra].
(for jdk7 now)

- with sbt 0.13.13 and scala 2.11.8
- bundled with sbt, and sbt-launch.jar
- add a `repositories` file, for overriding global resolvers
- essential plugins
  - [coursier][coursier] for faster artifact fetching
  - [sbt-assembly][sbt-assembly] for packaging fat jar
  - [sbt-aether-deploy][sbt-aether-deploy] for better maven deploy support
  - [sbt-revolver][sbt-revolver] for hot reloading
  - [sbt-native-packager][sbt-native-packager] for build archetype

Usages:

```
sbt new xsy233/scala-finatra.g8
```

[g8]: http://www.foundweekends.org/giter8/
[finatra]: https://twitter.github.io/finatra/
[coursier]: https://github.com/alexarchambault/coursier
[sbt-assembly]: https://github.com/sbt/sbt-assembly
[sbt-aether-deploy]: https://github.com/arktekk/sbt-aether-deploy
[sbt-revolver]: https://github.com/spray/sbt-revolver
[sbt-native-packager]: http://www.scala-sbt.org/sbt-native-packager/
