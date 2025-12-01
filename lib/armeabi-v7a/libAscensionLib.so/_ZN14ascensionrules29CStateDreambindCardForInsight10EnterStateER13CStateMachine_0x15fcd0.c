// 函数: _ZN14ascensionrules29CStateDreambindCardForInsight10EnterStateER13CStateMachine
// 地址: 0x15fcd0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_1 = *(arg1 + 0x24c)
ascension::CEvent* r7 = *(r0_1 + 4)
int32_t var_7c = 8
int32_t var_78 = 0
void* __offset(vtable_for_ascension::CEventQueryCardDefeatAttributes, 0x8) var_80 =
    _vtable_for_ascension::CEventQueryCardDefeatAttributes + 8
void* var_34 = r0_1
int32_t var_30 = 0
void* __offset(CStateMachine, 0x25c) var_2c = arg1 + 0x25c
void* r0_3 = *(arg1 + 0x258)

if (r0_3 != 0)
    *(r0_3 + 0x54)

ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_80, *(arg1 + 0x254))
int32_t r0_5 = *(arg1 + 0x250)
*(arg1 + 0x26c) = r0_5
*(arg1 + 0x270) = r0_5
ascension::CWorld::HandleQuery(r7)
int32_t r2_3 = *(arg1 + 0x270)

if (r2_3 s<= 0xffffffff)
    r2_3 = 0
    *(arg1 + 0x270) = 0

int32_t r3 = *(*(arg1 + 0x24c) + 0x8c)

if (zx.d(*(r7 + 0xb3d)) != 0)
    r3 += *(r7 + 0xb48)
    
    if (zx.d(*(r7 + 0xb29)) != 0)
        r3 += *(r7 + 0xb40)

if (r3 s>= r2_3)
    int32_t var_104_1 = 0
    CGameStateOptions::AddSimpleUserOption(arg1.w, *(*(arg1 + 0x254) + 8), 0xa0f0, "Dreambind %s", 
        ascensionrules::CStateDreambindCardForInsight::SelectDreambind)

int32_t var_104_2 = 0
CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa0f1, "Pass", 0)
int32_t r2_4 = *(arg1 + 0x270)
int32_t str

if (r2_4 s< 1)
    __builtin_strcpy(&str, "Dreambind Monster at no Cost?")
else
    sprintf(&str, "Pay %d Insight to Dreambind?", r2_4)

int32_t entry_r1
(*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), &str)
ascension::CEvent::~CEvent()
int32_t r0_16 = *__stack_chk_guard

if (r0_16 == r0)
    return r0_16 - r0

__stack_chk_fail()
noreturn
