package com.tnsif.userservice;
	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import jakarta.persistence.Column;
		@Entity
		public class UserService {
		    @Id
		    @Column(name="Sid")
		    private Long id;
		    @Column(name="Sname")
		    private String name;
		    @Column(name="Semail")
		    private String email;
		    @Column(name="Sphonenumber")
		    private String phonenumber;
			public UserService(Long id, String name, String email, String phonenumber) {
				super();
				this.id = id;
				this.name = name;
				this.email = email;
				this.phonenumber = phonenumber;
			}
			public UserService() {
				super();
				// TODO Auto-generated constructor stub
			}
			public Long getId() {
				return id;
			}
			public void setId(Long id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public String getPhonenumber() {
				return phonenumber;
			}
			public void setPhonenumber(String phonenumber) {
				this.phonenumber = phonenumber;
			}
			@Override
			public String toString() {
				return "UserService [id=" + id + ", name=" + name + ", email=" + email + ", phonenumber=" + phonenumber + "]";
			}
			
				
		    
	}
