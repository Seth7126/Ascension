// 函数: _ZN12ascension_ai11CWeightedAI17ScoreCurrentStateEPN9ascension6CWorldE
// 地址: 0x17ecc8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r5
int32_t var_20 = r5
int32_t r4
int32_t var_24 = r4
unimplemented  {vpush {d8, d9, d10}}
*(arg1 + 4)
void* r0_1 = ascension::CWorld::GetPlayerByIndex(*(arg1 + 0x20))
int32_t r1_1 = *(r0_1 + 0x60)
int32_t r1_2 = *(r0_1 + 0x64)
*(r0_1 + 0x54)
int32_t r0_3 = *(*(r0_1 + 0x84) + 0x18)
*(r0_1 + 0x58)
*(r0_1 + 0xc4)
int32_t q4 = *(r0_1 + 0xe4)
int32_t q5 = *(r0_1 + 0x164)
int32_t r9 = *(r0_1 + 0x154)
int32_t r10 = *(r0_1 + 0xb4)
int32_t r5_1 = *(r0_1 + 0xd0)
int32_t r7 = *(r0_1 + 0x170)
int32_t r1_5 = ascension::CPlayer::GetHonorCardTotal() + *(r0_1 + 0x90)
int32_t r0_6 = r7 + r5_1
unimplemented  {vmov.f32 s4, #5.000000}
int96_t q1
q1:8.d = q4 f+ q5
*(*(r0_1 + 0x3c) + 0x18)
unimplemented  {vcvt.f32.s32 s0, s0}
unimplemented  {vcvt.f32.s32 s2, s2}
q1.d = r1_5
unimplemented  {vmla.f32 s18, s6, s0}
unimplemented  {vcvt.f32.s32 s4, s4}
int128_t q2
q2.d = *(arg1 + 0x2c)
unimplemented  {vmov.f32 s6, #-0.500000}
q2:8.d = *(arg1 + 0x30)
int96_t q3
q3.d = *(arg1 + 0x34)
q3:8.d = *(arg1 + 0x38)
unimplemented  {vmla.f32 s4, s8, s2}
unimplemented  {vmov.f32 s2, #8.000000}
q2.d = q3:8.d f+ q3:8.d
unimplemented  {vcvt.f32.u32 s1, s1}
unimplemented  {vcmpe.f32 s18, s2}
unimplemented  {vmrs apsr_nzcv, fpscr}
unimplemented  {vmla.f32 s4, s10, s1}
unimplemented  {vcvt.f32.u32 s0, s0}
q2:8.d = r0_3 - ((r1_2 - r1_1) s>> 2) - r0_6
unimplemented  {vmla.f32 s4, s12, s0}
*(arg1 + 0x3c)
unimplemented  {vcvt.f32.u32 s10, s10}

if (r10 - r0_6 + r9 i- 1 s< 0)
    unimplemented  {vmovmi.f32 d2, #3.125000}

unimplemented  {vmla.f32 s4, s2, s8}
unimplemented  {vcvt.f32.s32 s2, s2}
unimplemented  {vmla.f32 s4, s0, s10}
void* entry_r1
q1:8.d = *(entry_r1 + 0xb48) + *(entry_r1 + 0xb40)
unimplemented  {vcvt.f32.s32 s6, s6}
unimplemented  {vmla.f32 s4, s0, s2}
*(arg1 + 0x44)
unimplemented  {vmla.f32 s4, s0, s6}
unimplemented  {vpop {d8, d9, d10}}
int32_t entry_r6
jump(entry_r6)
