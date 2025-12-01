// 函数: _ZN14ascensionrules52CStateProcessCopyEffectOfPlayedHeroOrDefeatedMonster10FixupCloneER13CStateMachine
// 地址: 0x14ee8c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r2 = *(arg1 + 0x28)

if (r2 == 0)
    return 

int32_t r1_1 = *(r2 + 0x25c)
CStateMachine& r4_1 = arg1

if (r1_1 != 0)
    arg1 = (*(*r4_1 + 0x2c))(r4_1, r1_1)
    r2 = *(r4_1 + 0x28)
    *(r4_1 + 0x25c) = arg1

int32_t r1_2 = *(r2 + 0x260)

if (r1_2 != 0)
    *(r4_1 + 0x260) = (*(*r4_1 + 0x2c))(r4_1, r1_2)
