private var postId = 0

class WallService {

    var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        postId +=1
        post.id = postId
        posts += post
        return post
    }

    fun update(post: Post): Boolean {
        for ((index, element) in posts.withIndex()) {
            if (element.id == post.id) {
                posts[index] = post
                return true
            }

        }
        return false
    }
}