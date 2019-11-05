import static org.junit.Assert.*;

public class PersonTest {

    @org.junit.Test
    public void marry() {
        //Test 1
        Person test_1_actor_1 = new Person(true,"First Actor");
        Person test_1_actor_2 = new Person(true,"Second Actor");
        //Must return false, because both of them are the same gender
        assertFalse(test_1_actor_1.marry(test_1_actor_2));

        //Test 2
        Person test_2_actor_1 = new Person(true,"First Actor");
        Person test_2_actor_2 = new Person(false,"Second Actor");
        test_2_actor_2.marry(test_2_actor_1);
        //Must return false, because they are already married
        assertFalse(test_2_actor_1.marry(test_2_actor_2));


        //Test 3
        Person test_3_actor_1 = new Person(true,"First Actor");
        Person test_3_actor_2 = new Person(false,"Second Actor");
        //Must return true, because they are both not married
        assertTrue(test_3_actor_1.marry(test_3_actor_2));

        //Test 4
        Person test_4_actor_1 = new Person(true,"First Actor");
        Person test_4_actor_2 = new Person(false,"Second Actor");
        test_4_actor_1.marry(test_4_actor_2);
        Person test_4_actor_3 = new Person(false,"Third Actor");
        //Must return true, because they are married, but not on each other
        assertTrue(test_4_actor_3.marry(test_4_actor_1));
    }

    @org.junit.Test
    public void divorce() throws Exception {

        //Test 1
        Person test_1_actor_1 = new Person(true,"First Actor");
        test_1_actor_1.setSpouse(null);
        //Must return false, because actor_1.spouse == null
        assertFalse(test_1_actor_1.divorce());



        //Test 2
        Person test_2_actor_1 = new Person(true,"First Actor");
        Person test_2_actor_2 = new Person(true,"Second Actor");
        test_2_actor_1.setSpouse(test_2_actor_2);
        test_2_actor_2.setSpouse(test_2_actor_1);
        //Must return true, because actor_1.spouse == actor_2 and actor_2.spouse == actor_1
        assertTrue(test_2_actor_1.divorce());




        //Test 3
        Person test_3_actor_1 = new Person(true,"First Actor");
        Person test_3_actor_2 = new Person(true,"Second Actor");
        test_3_actor_1.setSpouse(test_3_actor_2);
        test_3_actor_2.setSpouse(null);
        //Must return false, because actor_1.spouse == actor_2 and actor_2.spouse == null
        assertFalse(test_3_actor_1.divorce());



    }
}