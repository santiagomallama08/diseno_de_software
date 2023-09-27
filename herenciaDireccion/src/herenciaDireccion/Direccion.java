package herenciaDireccion;


public class Direccion extends Nombre{
		private String calle;
		private String ciudad;
		private String provincia;
		private int postal;
		
		public Direccion(String nombre, String primerApellido, String segundoApellido, String calle, String ciudad, String provincia, int postal) {
			super(nombre, primerApellido, segundoApellido);
			this.calle = calle;
			this.ciudad = ciudad;
			this.provincia = provincia;
			this.postal = postal;
		}

		public String getCalle() {
			return calle;
		}

		public void setCalle(String calle) {
			this.calle = calle;
		}

		public String getCiudad() {
			return ciudad;
		}

		public void setCiudad(String ciudad) {
			this.ciudad = ciudad;
		}

		public String getProvincia() {
			return provincia;
		}

		public void setProvincia(String provincia) {
			this.provincia = provincia;
		}

		public int getPostal() {
			return postal;
		}

		public void setPostal(int postal) {
			this.postal = postal;
		}
		public String toString () {
			return super.toString() + "Calle: " + calle + " ciudad : " + ciudad +" provincia:" + provincia + " Postal: " + postal  ;
			
		}
	}


