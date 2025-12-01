// 函数: _ZN9ascension6CWorld18QueryCenterRowSizeEPNS_7CPlayerE
// 地址: 0xf4208
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 6
int32_t r0 = *__stack_chk_guard

if (*(arg1 + 0x30) u>= 0xc)
    result = *(arg1 + 0xb14)

void* __offset(vtable_for_ascension::CEventQueryCenterRowSize, 0x8) var_70 =
    _vtable_for_ascension::CEventQueryCenterRowSize + 8
int32_t var_6c = 4
int32_t var_68 = 0
int32_t r1
int32_t var_24 = r1
ascension::CWorld** i = *(arg1 + 0xaa4)

for (int32_t r1_1 = *(arg1 + 0xaa8); i != r1_1; i = &i[1])
    ascension::CWorld* r0_3 = *i
    
    if ((zx.d(*(r0_3 + 0x148)) & 0x10) != 0)
        ascension::CActiveEffectInstance::HandleQuery(r0_3, arg1)
        r1_1 = *(arg1 + 0xaa8)

ascension::CEvent::~CEvent()

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
