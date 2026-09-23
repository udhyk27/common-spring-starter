<template>
  <div class="dashboard">
    <header class="header">
      <h1>WorkOffice</h1>

      <div class="user">
        <span>홍길동</span>
        <button>로그아웃</button>
      </div>
    </header>

    <div class="layout">
      <aside class="sidebar">
        <nav>
          <a class="active">대시보드</a>
          <a>일정</a>
          <a>전자결재</a>
          <a>게시판</a>
          <a>조직도</a>

          <div class="divider"></div>

          <a>사원 관리</a>
          <a>부서 관리</a>
        </nav>
      </aside>

      <main class="content">
        <div class="page-title">
          <h2>대시보드</h2>
          <p>안녕하세요, 홍길동님.</p>
        </div>

        <section class="summary">
          <div class="card">
            <span>오늘 일정</span>
            <strong>3</strong>
            <small>건</small>
          </div>

          <div class="card">
            <span>결재 대기</span>
            <strong>2</strong>
            <small>건</small>
          </div>

          <div class="card">
            <span>읽지 않은 알림</span>
            <strong>5</strong>
            <small>건</small>
          </div>
        </section>

        <section class="grid">
          <div class="panel">
            <div class="panel-header">
              <h3>오늘의 일정</h3>
              <button>더보기</button>
            </div>

            <div class="list">
              <div class="list-item">
                <span>09:00</span>
                <p>개발팀 주간 회의</p>
              </div>

              <div class="list-item">
                <span>14:00</span>
                <p>프로젝트 진행 회의</p>
              </div>

              <div class="list-item">
                <span>16:00</span>
                <p>코드 리뷰</p>
              </div>
            </div>
          </div>

          <div class="panel">
            <div class="panel-header">
              <h3>결재 대기</h3>
              <button>더보기</button>
            </div>

            <div class="list">
              <div class="list-item">
                <span>휴가</span>
                <p>연차 휴가 신청</p>
              </div>

              <div class="list-item">
                <span>지출</span>
                <p>개발비 지출 결의</p>
              </div>
            </div>
          </div>

          <div class="panel">
            <div class="panel-header">
              <h3>공지사항</h3>
              <button>더보기</button>
            </div>

            <div class="list">
              <div class="list-item">
                <span>09.23</span>
                <p>추석 연휴 휴무 안내</p>
              </div>

              <div class="list-item">
                <span>09.20</span>
                <p>사내 시스템 점검 안내</p>
              </div>

              <div class="list-item">
                <span>09.18</span>
                <p>그룹웨어 이용 안내</p>
              </div>
            </div>
          </div>
        </section>
      </main>
    </div>
  </div>
</template>

<style scoped>
* {
  box-sizing: border-box;
}

.dashboard {
  min-height: 100vh;
  background: #f5f6f8;
  color: #222;
}

/* Header */

.header {
  height: 64px;
  padding: 0 28px;
  display: flex;
  align-items: center;
  justify-content: space-between;
  background: #fff;
  border-bottom: 1px solid #e5e7eb;
}

.header h1 {
  font-size: 20px;
}

.user {
  display: flex;
  align-items: center;
  gap: 16px;
  font-size: 14px;
}

.user button,
.panel-header button {
  border: 0;
  background: none;
  color: #666;
  cursor: pointer;
}

/* Layout */

.layout {
  display: flex;
  min-height: calc(100vh - 64px);
}

.sidebar {
  width: 220px;
  padding: 24px 16px;
  background: #fff;
  border-right: 1px solid #e5e7eb;
}

.sidebar nav {
  display: flex;
  flex-direction: column;
  gap: 4px;
}

.sidebar a {
  padding: 12px 14px;
  border-radius: 6px;
  color: #555;
  font-size: 14px;
  cursor: pointer;
}

.sidebar a:hover,
.sidebar a.active {
  background: #f0f2f5;
  color: #111;
  font-weight: 600;
}

.divider {
  height: 1px;
  margin: 16px 0;
  background: #eee;
}

/* Content */

.content {
  flex: 1;
  padding: 32px;
  max-width: 1400px;
}

.page-title {
  margin-bottom: 24px;
}

.page-title h2 {
  margin-bottom: 8px;
  font-size: 24px;
}

.page-title p {
  color: #777;
  font-size: 14px;
}

/* Summary */

.summary {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 16px;
  margin-bottom: 24px;
}

.card {
  padding: 24px;
  background: #fff;
  border: 1px solid #e5e7eb;
  border-radius: 8px;
}

.card span {
  display: block;
  margin-bottom: 12px;
  color: #666;
  font-size: 14px;
}

.card strong {
  font-size: 28px;
}

.card small {
  margin-left: 4px;
  color: #777;
}

/* Panels */

.grid {
  display: grid;
  grid-template-columns: repeat(2, 1fr);
  gap: 16px;
}

.panel {
  background: #fff;
  border: 1px solid #e5e7eb;
  border-radius: 8px;
}

.panel-header {
  padding: 18px 20px;
  display: flex;
  align-items: center;
  justify-content: space-between;
  border-bottom: 1px solid #eee;
}

.panel-header h3 {
  font-size: 16px;
}

.list-item {
  display: flex;
  gap: 16px;
  padding: 16px 20px;
  border-bottom: 1px solid #f1f1f1;
  font-size: 14px;
}

.list-item:last-child {
  border-bottom: 0;
}

.list-item span {
  width: 50px;
  color: #888;
}

.list-item p {
  margin: 0;
}
</style>
