# Ejemplo de Consulta al servicio del ORCID
Proyecto demostrativo del uso del API expuesta por el servicio ORCID

Para ver una demostración de la  consulta diríjase a la clase de prueba ```mx.infotec.dads.orcid.service. ConsultaOrcidServiceTest```
##Ejemplo de consulta
El ejemplo cuenta con un token de acceso que deberá sustituirse por uno productivo.

##Credenciales y Token de acceso
En la clase ```mx.infotec.dads.orcid.service.impl. CredencialsManagerServiceImpl``` se encuentran las credenciales con las que se podrá conectar al servicio del ORCID.

El servicio del ORCID va a requerir de tres parámetros, mismos que se describen a continuación:

1. **ClientId** y **ClientSecret** se obtienen cuando creas una cuenta en ORCID. https://orcid.org/register

2. **token**: el token será obtenido una ves que se solicite al servicio del ORCID; tal y cómo se describe en a continuación:

```bash
curl -i -L -H "Accept: application/json" -d "client_id=APP-NPXKK6HFN6TJ4YYI" -d "client_secret=060c36f2-cce2-4f74-bde0-a17d8bb30a97" -d "scope=/read-public" -d "grant_type=client_credentials" "https://api.orcid.org/oauth/token"
```
La consula anterior va a regresar un token que tendrá vida ilimitada, por lo que se podrá utilizar para llevar a cabo todas la consultas necesarias al servicio del **ORCID**.

##Transformación de la consulta

En el paquete ```mx.infotec.dads.orcid.model.raworcid```` se encuentran todas las clases necesarias para manejar el objeto de consulta del ORCID. En este paquete se guarda la estructura de clases que encapsulan el objeto resultante de la consulta **REST** al ORCID. A continuación se muestra un ejemplo de la respuesta del servicio **REST** del **ORCID**.

```javascript
{
  "message-version" : "1.2",
  "orcid-profile" : null,
  "orcid-search-results" : {
    "orcid-search-result" : [ {
      "relevancy-score" : {
        "value" : 1.5812736
      },
      "orcid-profile" : {
        "orcid" : null,
        "orcid-id" : null,
        "orcid-identifier" : {
          "value" : null,
          "uri" : "http://orcid.org/0000-0001-5594-0524",
          "path" : "0000-0001-5594-0524",
          "host" : "orcid.org"
        },
        "orcid-deprecated" : null,
        "orcid-preferences" : null,
        "orcid-history" : null,
        "orcid-bio" : {
          "personal-details" : {
            "given-names" : {
              "value" : "Eder",
              "visibility" : "PUBLIC"
            },
            "family-name" : {
              "value" : "Anflor",
              "visibility" : "PUBLIC"
            },
            "credit-name" : null,
            "other-names" : {
              "other-name" : [ {
                "value" : "Enfermeiro Éder"
              } ],
              "visibility" : "PUBLIC"
            }
          },
          "biography" : null,
          "researcher-urls" : null,
          "contact-details" : {
            "email" : [ ],
            "address" : {
              "country" : {
                "value" : "BR",
                "visibility" : "PUBLIC"
              }
            }
          },
          "keywords" : {
            "keyword" : [ {
              "value" : "Enfermagem, Educação, Saúde"
            } ],
            "visibility" : "PUBLIC"
          },
          "external-identifiers" : null,
          "delegation" : null,
          "scope" : null
        },
        "orcid-activities" : null,
        "orcid-internal" : null,
        "type" : null,
        "group-type" : null,
        "client-type" : null
      }
    }, {
      "relevancy-score" : {
        "value" : 0.6930518
      },
      "orcid-profile" : {
        "orcid" : null,
        "orcid-id" : null,
        "orcid-identifier" : {
          "value" : null,
          "uri" : "http://orcid.org/0000-0001-5594-2511",
          "path" : "0000-0001-5594-2511",
          "host" : "orcid.org"
        },
        "orcid-deprecated" : null,
        "orcid-preferences" : null,
        "orcid-history" : null,
        "orcid-bio" : {
          "personal-details" : {
            "given-names" : {
              "value" : "Tao",
              "visibility" : "PUBLIC"
            },
            "family-name" : {
              "value" : "Liu",
              "visibility" : "PUBLIC"
            },
            "credit-name" : null,
            "other-names" : null
          },
          "biography" : null,
          "researcher-urls" : null,
          "contact-details" : null,
          "keywords" : null,
          "external-identifiers" : null,
          "delegation" : null,
          "scope" : null
        },
        "orcid-activities" : null,
        "orcid-internal" : null,
        "type" : null,
        "group-type" : null,
        "client-type" : null
      }
    }, {
      "relevancy-score" : {
        "value" : 0.68141
      },
      "orcid-profile" : {
        "orcid" : null,
        "orcid-id" : null,
        "orcid-identifier" : {
          "value" : null,
          "uri" : "http://orcid.org/0000-0001-5498-0524",
          "path" : "0000-0001-5498-0524",
          "host" : "orcid.org"
        },
        "orcid-deprecated" : null,
        "orcid-preferences" : null,
        "orcid-history" : null,
        "orcid-bio" : {
          "personal-details" : {
            "given-names" : {
              "value" : "Stephane",
              "visibility" : "PUBLIC"
            },
            "family-name" : {
              "value" : "Charmot",
              "visibility" : "PUBLIC"
            },
            "credit-name" : null,
            "other-names" : null
          },
          "biography" : null,
          "researcher-urls" : null,
          "contact-details" : null,
          "keywords" : null,
          "external-identifiers" : null,
          "delegation" : null,
          "scope" : null
        },
        "orcid-activities" : null,
        "orcid-internal" : null,
        "type" : null,
        "group-type" : null,
        "client-type" : null
      }
    }, {
      "relevancy-score" : {
        "value" : 0.68141
      },
      "orcid-profile" : {
        "orcid" : null,
        "orcid-id" : null,
        "orcid-identifier" : {
          "value" : null,
          "uri" : "http://orcid.org/0000-0001-9624-0524",
          "path" : "0000-0001-9624-0524",
          "host" : "orcid.org"
        },
        "orcid-deprecated" : null,
        "orcid-preferences" : null,
        "orcid-history" : null,
        "orcid-bio" : {
          "personal-details" : {
            "given-names" : {
              "value" : "Zachary",
              "visibility" : "PUBLIC"
            },
            "family-name" : {
              "value" : "Roeder",
              "visibility" : "PUBLIC"
            },
            "credit-name" : null,
            "other-names" : null
          },
          "biography" : null,
          "researcher-urls" : null,
          "contact-details" : null,
          "keywords" : null,
          "external-identifiers" : null,
          "delegation" : null,
          "scope" : null
        },
        "orcid-activities" : null,
        "orcid-internal" : null,
        "type" : null,
        "group-type" : null,
        "client-type" : null
      }
    }, {
      "relevancy-score" : {
        "value" : 0.68141
      },
      "orcid-profile" : {
        "orcid" : null,
        "orcid-id" : null,
        "orcid-identifier" : {
          "value" : null,
          "uri" : "http://orcid.org/0000-0001-6853-0524",
          "path" : "0000-0001-6853-0524",
          "host" : "orcid.org"
        },
        "orcid-deprecated" : null,
        "orcid-preferences" : null,
        "orcid-history" : null,
        "orcid-bio" : {
          "personal-details" : {
            "given-names" : {
              "value" : "John",
              "visibility" : "PUBLIC"
            },
            "family-name" : {
              "value" : "Brooks",
              "visibility" : "PUBLIC"
            },
            "credit-name" : null,
            "other-names" : null
          },
          "biography" : null,
          "researcher-urls" : null,
          "contact-details" : null,
          "keywords" : null,
          "external-identifiers" : null,
          "delegation" : null,
          "scope" : null
        },
        "orcid-activities" : null,
        "orcid-internal" : null,
        "type" : null,
        "group-type" : null,
        "client-type" : null
      }
    }, {
      "relevancy-score" : {
        "value" : 0.68141
      },
      "orcid-profile" : {
        "orcid" : null,
        "orcid-id" : null,
        "orcid-identifier" : {
          "value" : null,
          "uri" : "http://orcid.org/0000-0001-5076-0524",
          "path" : "0000-0001-5076-0524",
          "host" : "orcid.org"
        },
        "orcid-deprecated" : null,
        "orcid-preferences" : null,
        "orcid-history" : null,
        "orcid-bio" : {
          "personal-details" : {
            "given-names" : {
              "value" : "Tommi",
              "visibility" : "PUBLIC"
            },
            "family-name" : {
              "value" : "Nielsen",
              "visibility" : "PUBLIC"
            },
            "credit-name" : null,
            "other-names" : null
          },
          "biography" : null,
          "researcher-urls" : null,
          "contact-details" : null,
          "keywords" : null,
          "external-identifiers" : null,
          "delegation" : null,
          "scope" : null
        },
        "orcid-activities" : null,
        "orcid-internal" : null,
        "type" : null,
        "group-type" : null,
        "client-type" : null
      }
    }, {
      "relevancy-score" : {
        "value" : 0.68141
      },
      "orcid-profile" : {
        "orcid" : null,
        "orcid-id" : null,
        "orcid-identifier" : {
          "value" : null,
          "uri" : "http://orcid.org/0000-0001-5770-0524",
          "path" : "0000-0001-5770-0524",
          "host" : "orcid.org"
        },
        "orcid-deprecated" : null,
        "orcid-preferences" : null,
        "orcid-history" : null,
        "orcid-bio" : {
          "personal-details" : {
            "given-names" : {
              "value" : "Abdosllam",
              "visibility" : "PUBLIC"
            },
            "family-name" : {
              "value" : "Abobaker",
              "visibility" : "PUBLIC"
            },
            "credit-name" : null,
            "other-names" : null
          },
          "biography" : null,
          "researcher-urls" : null,
          "contact-details" : null,
          "keywords" : null,
          "external-identifiers" : null,
          "delegation" : null,
          "scope" : null
        },
        "orcid-activities" : null,
        "orcid-internal" : null,
        "type" : null,
        "group-type" : null,
        "client-type" : null
      }
    }, {
      "relevancy-score" : {
        "value" : 0.68141
      },
      "orcid-profile" : {
        "orcid" : null,
        "orcid-id" : null,
        "orcid-identifier" : {
          "value" : null,
          "uri" : "http://orcid.org/0000-0001-8971-0524",
          "path" : "0000-0001-8971-0524",
          "host" : "orcid.org"
        },
        "orcid-deprecated" : null,
        "orcid-preferences" : null,
        "orcid-history" : null,
        "orcid-bio" : {
          "personal-details" : {
            "given-names" : {
              "value" : "Emmanuel",
              "visibility" : "PUBLIC"
            },
            "family-name" : {
              "value" : "Oleka",
              "visibility" : "PUBLIC"
            },
            "credit-name" : null,
            "other-names" : null
          },
          "biography" : null,
          "researcher-urls" : null,
          "contact-details" : null,
          "keywords" : null,
          "external-identifiers" : null,
          "delegation" : null,
          "scope" : null
        },
        "orcid-activities" : null,
        "orcid-internal" : null,
        "type" : null,
        "group-type" : null,
        "client-type" : null
      }
    }, {
      "relevancy-score" : {
        "value" : 0.68141
      },
      "orcid-profile" : {
        "orcid" : null,
        "orcid-id" : null,
        "orcid-identifier" : {
          "value" : null,
          "uri" : "http://orcid.org/0000-0001-6458-0524",
          "path" : "0000-0001-6458-0524",
          "host" : "orcid.org"
        },
        "orcid-deprecated" : null,
        "orcid-preferences" : null,
        "orcid-history" : null,
        "orcid-bio" : {
          "personal-details" : {
            "given-names" : {
              "value" : "mary",
              "visibility" : "PUBLIC"
            },
            "family-name" : {
              "value" : "sharp",
              "visibility" : "PUBLIC"
            },
            "credit-name" : null,
            "other-names" : null
          },
          "biography" : null,
          "researcher-urls" : null,
          "contact-details" : {
            "email" : [ ],
            "address" : {
              "country" : {
                "value" : "AU",
                "visibility" : "PUBLIC"
              }
            }
          },
          "keywords" : null,
          "external-identifiers" : null,
          "delegation" : null,
          "scope" : null
        },
        "orcid-activities" : null,
        "orcid-internal" : null,
        "type" : null,
        "group-type" : null,
        "client-type" : null
      }
    }, {
      "relevancy-score" : {
        "value" : 0.68141
      },
      "orcid-profile" : {
        "orcid" : null,
        "orcid-id" : null,
        "orcid-identifier" : {
          "value" : null,
          "uri" : "http://orcid.org/0000-0001-8031-0524",
          "path" : "0000-0001-8031-0524",
          "host" : "orcid.org"
        },
        "orcid-deprecated" : null,
        "orcid-preferences" : null,
        "orcid-history" : null,
        "orcid-bio" : {
          "personal-details" : {
            "given-names" : {
              "value" : "Herch",
              "visibility" : "PUBLIC"
            },
            "family-name" : {
              "value" : "Nussenzveig",
              "visibility" : "PUBLIC"
            },
            "credit-name" : null,
            "other-names" : null
          },
          "biography" : null,
          "researcher-urls" : null,
          "contact-details" : null,
          "keywords" : null,
          "external-identifiers" : null,
          "delegation" : null,
          "scope" : null
        },
        "orcid-activities" : null,
        "orcid-internal" : null,
        "type" : null,
        "group-type" : null,
        "client-type" : null
      }
    } ],
    "num-found" : 2273758
  },
  "error-desc" : null
}
```

Por lo tanto, la estructura anterior es encapsulada dentro de las clases contenidas en el paquete ```mx.infotec.dads.orcid.model.raworcid````. 

El código siguiente muestra cómo convertir la respuesta json a un objeto java, utilizando el api de [Gson](https://github.com/google/gson):
```java
OrcidObject orcidObject = new Gson().fromJson(response.getEntity(String.class), OrcidObject.class);
  if (orcidObject != null) {
    return extractValues(orcidObject);
  } else {
    return null;
}
```
Para llevar a cabo la transformación de la consulta (por ejemplo del Objeto OrcidObjet a el objeto Persona) se deberá de especificar dentro de la clase ```mx.infotec.dads.orcid.support.OrcidPersonaTransform```

> **Nota**: El ejemplo que se muestra aquí se puede extender para las necesidades del proyecto, por lo que se recomienda consultar al equipo de la DADS para ver su adaptación.
