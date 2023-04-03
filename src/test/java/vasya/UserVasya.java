package vasya;

public class UserVasya {
        private String login = "vasya";
        private String password = "qwerty123";
        private String kod = "12345";

        public UserVasya(String login, String password, String kod) {
            this.login = login;
            this.password = password;
            this.kod = kod;
        }


        public String getLogin() {
            return login;
        }

        public String getPassword() {
            return password;
        }

        public String getKod() {
            return kod;
        }
    }

