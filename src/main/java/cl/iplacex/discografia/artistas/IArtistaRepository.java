package cl.iplacex.discografia.artistas;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IArtistaRepository extends MongoRepository<Artista, String> {
    // No es necesario agregar nada extra por ahora
}
