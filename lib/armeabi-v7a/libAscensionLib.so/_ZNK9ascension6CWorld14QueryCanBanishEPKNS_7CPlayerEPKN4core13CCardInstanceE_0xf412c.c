// 函数: _ZNK9ascension6CWorld14QueryCanBanishEPKNS_7CPlayerEPKN4core13CCardInstanceE
// 地址: 0xf412c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t var_70 = 3
int32_t var_6c = 0
void* __offset(vtable_for_ascension::CEventQueryCanBanish, 0x8) var_74 =
    _vtable_for_ascension::CEventQueryCanBanish + 8
core::CCardInstance const* var_28 = arg2
int32_t r2
int32_t var_24 = r2
char var_20 = 1
ascension::CWorld** i = *(arg1 + 0xaa4)

for (int32_t r1 = *(arg1 + 0xaa8); i != r1; i = &i[1])
    ascension::CWorld* r0_2 = *i
    
    if ((zx.d(*(r0_2 + 0x148)) & 8) != 0)
        ascension::CActiveEffectInstance::HandleQuery(r0_2, arg1)
        r1 = *(arg1 + 0xaa8)

ascension::CEvent::~CEvent()

if (*__stack_chk_guard == r0)
    return 1

__stack_chk_fail()
noreturn
