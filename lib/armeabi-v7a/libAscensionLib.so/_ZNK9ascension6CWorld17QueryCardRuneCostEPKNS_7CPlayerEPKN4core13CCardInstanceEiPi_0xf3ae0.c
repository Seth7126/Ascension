// 函数: _ZNK9ascension6CWorld17QueryCardRuneCostEPKNS_7CPlayerEPKN4core13CCardInstanceEiPi
// 地址: 0xf3ae0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t var_78 = 6
int32_t var_74 = 0
void* __offset(vtable_for_ascension::CEventQueryCardAcquireAttributes, 0x8) var_7c =
    _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
core::CCardInstance const* var_30 = arg2
int32_t var_2c = 0
void var_c0
void* var_28 = &var_c0
ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_7c, arg3, arg4)
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

int32_t var_b4
int32_t* arg_0
int32_t var_b8

if (arg_0 != 0)
    *arg_0 = var_b4 - var_b8
ascension::CEvent::~CEvent()

if (*__stack_chk_guard == r0)
    return var_b4 & not.d(var_b4 s>> 0x1f)

__stack_chk_fail()
noreturn
