package signleton;

import java.util.Map;

public enum UsersRepository {;


        protected Map<String, String > usernameToEmails;

        public Map<String, String> getUsernameToEmails() {
            return usernameToEmails;
        }

        void addUser(String username, String email){
            usernameToEmails.put(username, email);
        }

    }


