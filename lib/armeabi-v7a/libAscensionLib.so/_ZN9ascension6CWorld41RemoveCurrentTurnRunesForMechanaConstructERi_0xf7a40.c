// 函数: _ZN9ascension6CWorld41RemoveCurrentTurnRunesForMechanaConstructERi
// 地址: 0xf7a40
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* entry_r1
int32_t* r4 = entry_r1
void* r0 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_header.entry:3)
int32_t r1 = arg1[0x2d1]

if (r0 != 0)
    *(r0 + 0xc) = r1

int32_t result = *r4
void* r2 = &arg1[0x2d1]
int32_t r3_1 = r1 - result

if (r1 s< result)
    r2 = r4
    r3_1 = result - r1

*r2 = r3_1

if (r1 s< result)
    r4 = &arg1[0x2d1]

*r4 = 0
return result
