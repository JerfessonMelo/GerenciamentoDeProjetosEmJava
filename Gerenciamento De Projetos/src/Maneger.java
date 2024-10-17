public class Maneger extends Member {

	private String department;
	
	public Maneger(int id, String name, String function, String email, String senha, String telephone, String projectRole) {
		super(id, name, function, email, senha, telephone);
        this.department = projectRole;
	}
	
	public void ManagerInfo() {
        String info = String.format("Manager Info: ID: %d, Name: %s, Function: %s, Email: %s, Telephone: %s, Department: %s",
                getId(), getName(), getFunction(), getEmail(), getTelephone(), department);
        System.out.println(info);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }	

    void removeMeneger(int id_remove) {
	namesList.remove(id_remove);
		
	}
}
