// 函数: _ZN14ascensionrules30CStatePutMonsterUnderConstruct10EnterStateER13CStateMachine
// 地址: 0x140408
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r6 = *(*(arg1 + 0x24c) + 4)
ascension::CWorld::PushResolveEffect(r6, *(*(arg1 + 0x250) + 0x10))
void* r0_3 = *(arg1 + 0x250)
uint32_t var_b8 = zx.d(*(r0_3 + 8))
void* var_b4 = 0xb
int32_t var_a8 = 0
ascension::CWorld::OutputAnimationCard(r6, *(r0_3 + 0x10), 1, 4, var_b8, 0xb, 0, 0)
void* r0_7 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_7 != 0 && *(*(r0_7 + 0xc) + 0x88) == 3)
    var_b4 = r0_7
    var_b8 = ascensionrules::CStatePutMonsterUnderConstruct::SelectCardToPutUnderConstruct
    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_7 + 8), 0xa034, "Put %s", var_b8)

void* r0_10 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_10 != 0 && *(*(r0_10 + 0xc) + 0x88) == 3)
    var_b4 = r0_10
    var_b8 = ascensionrules::CStatePutMonsterUnderConstruct::SelectCardToPutUnderConstruct
    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_10 + 8), 0xa034, "Put %s", var_b8)

void* r0_13 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_13 != 0 && *(*(r0_13 + 0xc) + 0x88) == 3)
    var_b4 = r0_13
    var_b8 = ascensionrules::CStatePutMonsterUnderConstruct::SelectCardToPutUnderConstruct
    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_13 + 8), 0xa034, "Put %s", var_b8)

void* r0_16 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_16 != 0 && *(*(r0_16 + 0xc) + 0x88) == 3)
    var_b4 = r0_16
    var_b8 = ascensionrules::CStatePutMonsterUnderConstruct::SelectCardToPutUnderConstruct
    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_16 + 8), 0xa034, "Put %s", var_b8)

void* r0_19 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_19 != 0 && *(*(r0_19 + 0xc) + 0x88) == 3)
    var_b4 = r0_19
    var_b8 = ascensionrules::CStatePutMonsterUnderConstruct::SelectCardToPutUnderConstruct
    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_19 + 8), 0xa034, "Put %s", var_b8)

void* r0_22 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_22 != 0 && *(*(r0_22 + 0xc) + 0x88) == 3)
    var_b4 = r0_22
    var_b8 = ascensionrules::CStatePutMonsterUnderConstruct::SelectCardToPutUnderConstruct
    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_22 + 8), 0xa034, "Put %s", var_b8)

void* r0_25 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_25 != 0 && *(*(r0_25 + 0xc) + 0x88) == 3)
    var_b4 = r0_25
    var_b8 = ascensionrules::CStatePutMonsterUnderConstruct::SelectCardToPutUnderConstruct
    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_25 + 8), 0xa034, "Put %s", var_b8)

char str[0x80]
sprintf(&str, "You Must Put a Monster under %s", (*(**(arg1 + 0x250) + 0xc))())
int32_t entry_r1
(*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), &str, var_b8, var_b4)
int32_t r0_32 = *__stack_chk_guard

if (r0_32 == r0)
    return r0_32 - r0

__stack_chk_fail()
noreturn
