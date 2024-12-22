package com.adam9e96.MVCModelStudy.repository;


import com.adam9e96.MVCModelStudy.entity.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends CrudRepository<Member, Integer> {
}
