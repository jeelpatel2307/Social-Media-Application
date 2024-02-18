## Social Media Application

The Social Media Application is a Python program that simulates basic functionalities of a social media platform. It allows users to register, create posts, and view posts made by other users.

### Features

- User Registration: Users can register with a username and email.
- Post Creation: Users can create posts with content.
- Post Viewing: Users can view posts made by themselves and other users.

### How to Use

1. Create instances of the `SocialMediaApp` class to manage user registration and retrieval.
2. Register users using the `register_user` method, providing a username and email.
3. Retrieve user objects using the `get_user` method based on their email.
4. Create posts using the `create_post` method of the `User` class, providing the post content.
5. View posts using the `view_posts` method of the `User` class.

### Example

```python
# Initialize SocialMediaApp
social_media_app = SocialMediaApp()

# Register users
social_media_app.register_user("user1", "user1@example.com")
social_media_app.register_user("user2", "user2@example.com")

# Retrieve user objects
user1 = social_media_app.get_user("user1@example.com")
user2 = social_media_app.get_user("user2@example.com")

# Create posts
user1.create_post("Hello from user1!")
user1.create_post("Second post from user1")
user2.create_post("Greetings from user2")

# View posts
user1.view_posts()
user2.view_posts()

```

### Contributing

Contributions to improve the Social Media Application project are welcome! Fork the repository, make your changes, and submit a pull request.

### Credits

This project was created by Jeel patel.
