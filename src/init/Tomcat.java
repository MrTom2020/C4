package init;

import Animals.Cat;

public class Tomcat extends Cat
{
    private String _Name;
    private String _Age;
    private String _Sex;

    public Tomcat(String _Name, String _Age) {
        this._Name = _Name;
        this._Age = _Age;
        this._Sex = "Male";
    }

    @Override
    public String get_Name() {
        return _Name;
    }

    @Override
    public void set_Name(String _Name) {
        this._Name = _Name;
    }

    @Override
    public String get_Age() {
        return _Age;
    }

    @Override
    public void set_Age(String _Age) {
        this._Age = _Age;
    }

    @Override
    public String get_Sex() {
        return _Sex;
    }

    @Override
    public void set_Sex(String _Sex) {
        this._Sex = _Sex;
    }
}
