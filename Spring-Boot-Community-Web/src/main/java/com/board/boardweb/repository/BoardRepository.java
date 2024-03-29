package com.board.boardweb.repository;

import com.board.boardweb.domain.Board;
import com.board.boardweb.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findByMember(Member user);
}
