FROM jboss/keycloak:3.2.1.Final

ENV KEYCLOAK_IMPORT_REALM ${KEYCLOAK_IMPORT_REALM:-cmi-realm.json}

RUN /opt/jboss/keycloak/bin/add-inscription.sh -u admin -p password

ADD cmi-realm.json /opt/jboss/keycloak/

ENTRYPOINT [ "/opt/jboss/docker-entrypoint.sh" ]

CMD ["-b", "0.0.0.0", "-Dkeycloak.import=/opt/jboss/keycloak/cmi-realm.json"]
