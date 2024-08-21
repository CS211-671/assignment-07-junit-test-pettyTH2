package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    UserList user;

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {


        // TODO: add 3 users to UserList
        user = new UserList();
        user.addUser("user1", "p1");
        user.addUser("user2", "p2");
        user.addUser("user3", "p3");
        // TODO: find one of them
        User tempUser = user.findUserByUsername("user1");
        // TODO: assert that UserList found User
         String expected = "user1";
         String actual = tempUser.getUsername();
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        user = new UserList();
        user.addUser("user1", "p1");
        user.addUser("user2", "p2");
        user.addUser("user3", "p3");
        // TODO: change password of one user
        boolean actual = user.changePassword("user2", "p2", "n2");
        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with correct username and password

        // TODO: assert that User object is found
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with incorrect username or incorrect password

        // TODO: assert that the method return null
        // assertNull(actual);
    }

}