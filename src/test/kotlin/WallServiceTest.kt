import org.junit.Assert.*

class WallServiceTest {
    private val wallService = WallService()

    @org.junit.Test
    fun add() {
        //arrange

        val post = Post(
            0,
            3465,
            3487,
            6543,
            1234567890,
            "Test post",
            8765,
            5432,
            true,
            Comments(3u, true, true, true, true),
            "www.nosite.com",
            Likes(7u, true, true, true),
            Reposts(1u, true),
            Views(4u),
            PostType.Suggest,
            4567,
            true,
            true,
            true,
            true,
            true,
            true,
            3498
        )

        //act
        wallService.add(post)

        //assert
        assertEquals(1, wallService.posts[0].id)
    }

    @org.junit.Test
    fun updateExistingPost() {
        val post1 = Post(
            0,
            76564,
            3487,
            6543,
            1234567890,
            "Test post",
            643255,
            5432,
            true,
            Comments(3u, true, true, true, true),
            "www.nosite.com",
            Likes(7u, true, true, true),
            Reposts(1u, true),
            Views(4u),
            PostType.Suggest,
            4567,
            true,
            true,
            true,
            true,
            true,
            true,
            3498
        )

        val post2 = Post(
            1,
            76564,
            3487,
            6543,
            1234567890,
            "Заменить!",
            643255,
            5432,
            true,
            Comments(3u, true, true, true, true),
            "www.nosite.com",
            Likes(7u, true, true, true),
            Reposts(1u, true),
            Views(4u),
            PostType.Suggest,
            4567,
            true,
            true,
            true,
            true,
            true,
            true,
            3498
        )

        //act
        wallService.add(post1)

        //assert
        assertEquals(true, wallService.update(post2))
    }

    @org.junit.Test
    fun updateNotExistingPost() {
        val post1 = Post(
            0,
            76564,
            3487,
            6543,
            1234567890,
            "Test post",
            643255,
            5432,
            true,
            Comments(3u, true, true, true, true),
            "www.nosite.com",
            Likes(7u, true, true, true),
            Reposts(1u, true),
            Views(4u),
            PostType.Suggest,
            4567,
            true,
            true,
            true,
            true,
            true,
            true,
            3498
        )

        val post2 = Post(
            98768765,
            76564,
            3487,
            6543,
            1234567890,
            "Заменить!",
            643255,
            5432,
            true,
            Comments(3u, true, true, true, true),
            "www.nosite.com",
            Likes(7u, true, true, true),
            Reposts(1u, true),
            Views(4u),
            PostType.Suggest,
            4567,
            true,
            true,
            true,
            true,
            true,
            true,
            3498
        )

        //act
        wallService.add(post1)

        //assert
        assertEquals(false, wallService.update(post2))
    }
}