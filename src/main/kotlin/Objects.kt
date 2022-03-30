class Likes(
    var count: UInt,
    var userLikes: Boolean,
    var canLike: Boolean,
    var canPublish: Boolean
) {
}

class Comments(
    var count: UInt,
    var canPost: Boolean,
    var groupsCanPost: Boolean,
    var canClose: Boolean,
    var canOpen: Boolean
) {
}

class Reposts(
    var count: UInt,
    var userReposted: Boolean
) {
}

class Views(
    var count: UInt
) {
}

enum class PostType {
    Post, Copy, Reply, Postpone, Suggest
}

