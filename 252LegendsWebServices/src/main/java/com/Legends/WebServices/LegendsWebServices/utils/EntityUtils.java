package com.Legends.WebServices.LegendsWebServices.utils;

import java.util.Collection;

import org.springframework.orm.ObjectRetrievalFailureException;

import com.Legends.WebServices.LegendsWebServices.model.Entity;

public abstract class EntityUtils {

		public static <T extends Entity> T getById(Collection<T> entities, Class<T> entityClass, int entityId)
			throws ObjectRetrievalFailureException{
			
				for(T entity: entities) {
					if(entity.getId() == entityId && entityClass.isInstance(entity)) {
						return entity;
					}
				}
				throw new ObjectRetrievalFailureException(entityClass, entityId);
		}
}
