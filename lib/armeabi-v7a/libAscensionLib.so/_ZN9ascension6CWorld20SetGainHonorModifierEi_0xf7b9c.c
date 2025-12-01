// 函数: _ZN9ascension6CWorld20SetGainHonorModifierEi
// 地址: 0xf7b9c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *(arg1 + 0xb5c)
int32_t entry_r1

if (r0 s>= entry_r1)
    return r0

void* r0_2 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_header.section_header_offset:1)

if (r0_2 != 0)
    *(r0_2 + 0xc) = *(arg1 + 0xb5c)

*(arg1 + 0xb5c) = entry_r1
return r0_2
