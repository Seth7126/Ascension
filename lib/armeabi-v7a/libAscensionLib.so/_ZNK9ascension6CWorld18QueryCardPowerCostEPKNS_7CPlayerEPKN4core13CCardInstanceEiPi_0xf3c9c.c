// 函数: _ZNK9ascension6CWorld18QueryCardPowerCostEPKNS_7CPlayerEPKN4core13CCardInstanceEiPi
// 地址: 0xf3c9c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t var_78 = 8
int32_t var_74 = 0
void* __offset(vtable_for_ascension::CEventQueryCardDefeatAttributes, 0x8) var_7c =
    _vtable_for_ascension::CEventQueryCardDefeatAttributes + 8
core::CCardInstance const* var_30 = arg2
int32_t var_2c = 0
void var_b0
void* var_28 = &var_b0
ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_7c, arg3)
ascension::CWorld** i = *(arg1 + 0xaa4)
int32_t r1_1 = *(arg1 + 0xaa8)
int32_t r5 = 1 << var_78
uint32_t r6 = 1 u>> (0x20 - var_78)

if (var_78 - 0x20 s>= 0)
    r6 = 1 << (var_78 - 0x20)
    r5 = 0

for (; i != r1_1; i = &i[1])
    ascension::CWorld* r0_3 = *i
    
    if (((*(r0_3 + 0x148) & r5) | (*(r0_3 + 0x14c) & r6)) != 0)
        ascension::CActiveEffectInstance::HandleQuery(r0_3, arg1)
        r1_1 = *(arg1 + 0xaa8)

int32_t var_a4
int32_t* arg_0
int32_t var_a8

if (arg_0 != 0)
    *arg_0 = var_a4 - var_a8
ascension::CEvent::~CEvent()

if (*__stack_chk_guard == r0)
    return var_a4 & not.d(var_a4 s>> 0x1f)

__stack_chk_fail()
noreturn
