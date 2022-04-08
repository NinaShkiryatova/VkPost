class Post(
    var id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: Comments,
    val copyright: String,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val postType: PostType,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val postponedId: Int
) {
    fun copy(
        id: Int = this.id,
        ownerId: Int = this.ownerId,
        fromId: Int = this.fromId,
        createdBy: Int = this.createdBy,
        date: Int = this.date,
        text: String = this.text,
        replyOwnerId: Int = this.replyOwnerId,
        replyPostId: Int = this.replyPostId,
        friendsOnly: Boolean = this.friendsOnly,
        comments: Comments = this.comments,
        copyright: String = this.copyright,
        likes: Likes = this.likes,
        reposts: Reposts = this.reposts,
        views: Views = this.views,
        postType: PostType = this.postType,
        signerId: Int = this.signerId,
        canPin: Boolean = this.canPin,
        canDelete: Boolean = this.canDelete,
        canEdit: Boolean = this.canEdit,
        isPinned: Boolean = this.isPinned,
        markedAsAds: Boolean = this.markedAsAds,
        isFavorite: Boolean = this.isFavorite,
        postponedId: Int = this.postponedId
    ) = Post (id, ownerId, fromId, createdBy, date, text, replyOwnerId, replyPostId, friendsOnly, comments, copyright, likes, reposts, views, postType, signerId, canPin, canDelete, canEdit, isPinned, markedAsAds, isFavorite, postponedId)
}