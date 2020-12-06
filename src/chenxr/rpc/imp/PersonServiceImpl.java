package chenxr.rpc.imp;

import chenxr.rpc.imp.Person;
import chenxr.rpc.imp.PersonService;
import chenxr.rpc.anno.RpcService;

@RpcService(PersonService.class)
public class PersonServiceImpl implements PersonService{

    public Person getInfo() {
        Person person = new Person();
        person.setAge(22);
        person.setName("qjm");
        person.setSex("男");
        return person;
    }

    public boolean printInfo(Person person) {
        if(person != null){
            System.out.println(person);
            return true;
        }
        return false;
    }

}