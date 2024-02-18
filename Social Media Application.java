class User:
    def __init__(self, username, email):
        self.username = username
        self.email = email
        self.posts = []

    def create_post(self, content):
        """
        Create a new post and add it to the user's posts.
        """
        post = Post(content)
        self.posts.append(post)

    def view_posts(self):
        """
        View all posts created by the user.
        """
        if not self.posts:
            print("You haven't created any posts yet!")
        else:
            for post in self.posts:
                print(f"Post ID: {post.post_id}\nContent: {post.content}\n")

class Post:
    _id_counter = 1

    def __init__(self, content):
        self.post_id = Post._id_counter
        self.content = content
        Post._id_counter += 1

class SocialMediaApp:
    def __init__(self):
        self.users = {}

    def register_user(self, username, email):
        """
        Register a new user in the social media application.
        """
        if email in self.users:
            print("Email is already registered!")
        else:
            user = User(username, email)
            self.users[email] = user

    def get_user(self, email):
        """
        Retrieve user object based on email.
        """
        return self.users.get(email, None)

def main():
    social_media_app = SocialMediaApp()

    # Register users
    social_media_app.register_user("user1", "user1@example.com")
    social_media_app.register_user("user2", "user2@example.com")

    # Create posts
    user1 = social_media_app.get_user("user1@example.com")
    user1.create_post("Hello from user1!")
    user1.create_post("Second post from user1")

    user2 = social_media_app.get_user("user2@example.com")
    user2.create_post("Greetings from user2")

    # View posts
    user1.view_posts()
    user2.view_posts()

if __name__ == "__main__":
    main()
