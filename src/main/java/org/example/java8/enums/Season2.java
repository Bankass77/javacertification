package org.example.java8.enums;

public enum Season2 {
    WINTER {
        public String getHours() {

            return "10am-3pm";
        }
    },
    SPRING {
        public String getHours() {

            return "9am-5pm";
        }
    },
    SUMMER {
        public String getHours() {

            return "10am-3pm";
        }
    },
    FALL {
        public String getHours() {

            return "10am-3pm";
        }
    };

}
