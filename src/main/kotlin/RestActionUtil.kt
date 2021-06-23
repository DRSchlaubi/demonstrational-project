
import kotlinx.coroutines.future.await
import net.dv8tion.jda.api.requests.RestAction

/**
 * Suspends the current coroutine until the request is done.
 */
suspend fun <T> RestAction<T>.await(): T = submit().await()
