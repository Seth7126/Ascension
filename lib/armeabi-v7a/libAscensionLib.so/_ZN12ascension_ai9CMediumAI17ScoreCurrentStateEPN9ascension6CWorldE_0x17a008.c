// 函数: _ZN12ascension_ai9CMediumAI17ScoreCurrentStateEPN9ascension6CWorldE
// 地址: 0x17a008
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

unimplemented  {vpush {d8, d9, d10, d11}}
*(arg1 + 4)
void* r0_1 = ascension::CWorld::GetPlayerByIndex(*(arg1 + 0x20))
int96_t q4
q4:8.d = *(r0_1 + 0xc4)
*(*(r0_1 + 0x44) + 0x18)
int32_t r0_3 = *(r0_1 + 0x60)
int32_t r0_4 = *(r0_1 + 0x64)
int32_t r0_5 = *(r0_1 + 0x54)
int32_t r0_6 = *(*(r0_1 + 0x84) + 0x18)
int96_t q5
q5.d = *(r0_1 + 0xe4)
int32_t r7 = *(r0_1 + 0x58)
q5:8.d = *(r0_1 + 0x164)
int32_t r8 = *(r0_1 + 0x154)
int32_t r9 = *(r0_1 + 0xb4)
int32_t r10 = *(r0_1 + 0xd0)
int32_t r6 = *(r0_1 + 0x170)
*(r0_1 + 0x90)
unimplemented  {vcvt.f32.u32 s16, s0}
ascension::CPlayer::GetHonorCardTotal()
int32_t r0_9 = r6 + r10
unimplemented  {vmov.f32 s4, #5.000000}
int128_t q2
q2.d = q4:8.d f+ q5:8.d
int128_t q3
q3.d = 0x3e4ccccd
unimplemented  {vcvt.f32.s32 s0, s0}
unimplemented  {vcvt.f32.s32 s2, s2}
unimplemented  {vmla.f32 s20, s8, s0}
q2.d = 0x3f99999a
unimplemented  {vcvt.f32.s32 s4, s4}
q2:8.d = (r7 - r0_5) s>> 2
unimplemented  {vmla.f32 s4, s2, s6}
unimplemented  {vmov.f32 s6, #8.000000}
unimplemented  {vcvt.f32.u32 s10, s10}
unimplemented  {vmov.f32 s2, #0.500000}
unimplemented  {vcmpe.f32 s20, s6}
unimplemented  {vmrs apsr_nzcv, fpscr}
unimplemented  {vmla.f32 s4, s10, s12}
unimplemented  {vcvt.f32.u32 s0, s0}
unimplemented  {vmla.f32 s4, s0, s2}
*(r0_1 + 0x8c)
*(r0_1 + 0xa0)
unimplemented  {vcvt.f32.s32 s0, s0}

if (r9 - r0_9 + r8 i- 1 s< 0)
    unimplemented  {vmovmi.f32 d6, #3.250000}

unimplemented  {vmla.f32 s4, s6, s8}
q2.d = r0_6 - ((r0_4 - r0_3) s>> 2) - r0_9
unimplemented  {vcvt.f32.u32 s8, s8}
unimplemented  {vmla.f32 s4, s0, s6}
unimplemented  {vmla.f32 s4, s8, s0}
unimplemented  {vcvt.f32.s32 s0, s2}
unimplemented  {vmla.f32 s4, s16, s12}
void* entry_r1
*(entry_r1 + 0xb48) + *(entry_r1 + 0xb40)
unimplemented  {vcvt.f32.s32 s6, s6}
unimplemented  {vmla.f32 s4, s0, s2}
unimplemented  {vmla.f32 s4, s6, s0}
unimplemented  {vpop {d8, d9, d10, d11}}
int32_t entry_r4
jump(entry_r4)
