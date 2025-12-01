// 函数: _ZN14ascensionrules14TriggerIfIsDayEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfef6c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *__stack_chk_guard
int32_t r1_1 = *(arg3 + 4)
bool* r1_2
int32_t r3

if (r1_1 != 8)
    r3 = 0
    r1_2 = nullptr

if (r1_1 == 8 || r1_1 == 6)
    r1_2 = *(arg3 + 0x4c)
    r3 = 1

int32_t var_20 = r3
void var_16
bool var_15
ascension::CWorld::GetCenterRowDayNight(arg1, r1_2, &var_15, &var_16)

if (*__stack_chk_guard == r1)
    return zx.d(var_15)

__stack_chk_fail()
noreturn
