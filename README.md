# scala-stackmaperror
Contains a SBT project exemplifying scala/bug#11294.

There are two sub projects in this repo: 
* **failures** containing code that causes the error during JMH annotation processing, run with: `sbt failures/jmh:run`.
* **successes** containing similar code that does not cause the error, run with: `sbt successes/jmh:run`.

Please, observe that the JMH benchmarking code is completely bogus and does not make sense on its own, its only purpose is to let JMH produce the error for the related issue.
