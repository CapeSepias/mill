package mill.integration
package forked

object DocAnnotationsTests extends DocAnnotationsTests(fork = true, clientServer = false)
object HygieneTests extends HygieneTests(fork = true, clientServer = false)
object LargeProjectTests extends LargeProjectTests(fork = true, clientServer = false)
object ScriptsInvalidationTests extends ScriptsInvalidationTests(fork = true, clientServer = false)
object ScriptsInvalidationForeignTests extends ScriptsInvalidationForeignTests(fork = true, clientServer = false)
