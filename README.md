# orcid-client
Proyecto demostrativo del uso del API expuesta por el servicio ORCID

Para ver el ejemplo completo, por favor dirí


Para ver la consulta completa, diríjase a la clase de prueba ```mx.infotec.dads.orcid.service. ConsultaOrcidServiceTest```

El ejemplo cuenta con un token de acceso que deberá sustituirse por uno productivo.

En la clase ```mx.infotec.dads.orcid.service.impl. CredencialsManagerServiceImpl``` se encuentran las credenciales con las que se podrá conectar al servicio del ORCID.

El servicio del ORCID va a requerir de tres parámetros, mismos que se describen a continuación:

ClientId y ClientSecret se obtienen cuando creas una cuenta en ORCID.
token: el token será obtenido una ves que se solicite al servicio del ORCID; tal y cómo se describe en a continuación:

```bash
curl -i -L -H "Accept: application/json" -d "client_id=APP-NPXKK6HFN6TJ4YYI" -d "client_secret=060c36f2-cce2-4f74-bde0-a17d8bb30a97" -d "scope=/read-public" -d "grant_type=client_credentials" "https://api.sandbox.orcid.org/oauth/token"
```

 
