// 函数: _ZN9ascension7CPlayer15RemoveOwnedCardEPN4core13CCardInstanceE
// 地址: 0xed880
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r10 = *(arg1 + 4)
uint32_t r9 = zx.d(*(arg1 + 8))
void* entry_r1
void* r5 = *(entry_r1 + 0xc)

if (core::CCardStack::RemoveCard(*(arg1 + 0x84)) == 0)
    int32_t result = *(r10 + 0x30)
    
    if (result u> 8)
        return result
else
    void* r0_3 = core::CWorldBase::AddRollbackData(r10, r9, &__elf_program_headers[6].align:2)
    
    if (r0_3 != 0)
        *(r0_3 + 0xc) = zx.d(*(entry_r1 + 8))
    
    int32_t r0_5 = *(r5 + 0x88) - 1
    
    if (r0_5 u<= 5)
        void* r0_6 = arg1 + (r0_5 << 5)
        int96_t q0
        q0.d = *(r0_6 + 0xb8)
        q0:8.d = *(r0_6 + 0xbc)
        int96_t q1
        q1.d = *(r0_6 + 0xc0)
        q1:8.d = *(r0_6 + 0xc4)
        *(r0_6 + 0xb4) -= 1
        q0.d = q0.d f- *(r5 + 0x168)
        *(r0_6 + 0xb8) = q0.d
        q0.d = *(r5 + 0x16c)
        q0.d = q0:8.d f- q0.d
        *(r0_6 + 0xbc) = q0.d
        q0.d = *(r5 + 0x170)
        int32_t r1_4 = *(r0_6 + 0xd0)
        q0.d = q1.d f- q0.d
        *(r0_6 + 0xc0) = q0.d
        *(r0_6 + 0xd0) = r1_4 - *(r5 + 0x180)
        q0.d = *(r5 + 0x174)
        q0.d = q1:8.d f- q0.d
        *(r0_6 + 0xc4) = q0.d
        q0.d = *(r0_6 + 0xc8)
        q0:8.d = *(r5 + 0x178)
        q0.d = q0.d f- q0:8.d
        *(r0_6 + 0xc8) = q0.d
        q0.d = *(r0_6 + 0xcc)
        q0:8.d = *(r5 + 0x17c)
        q0.d = q0.d f- q0:8.d
        *(r0_6 + 0xcc) = q0.d

int32_t r4_1 = *(r5 + 0xa4)

if (r4_1 s>= 1)
    void* r0_8 = core::CWorldBase::AddRollbackData(r10, r9, &__elf_program_headers[7].type:2)
    int32_t r1_7 = *(arg1 + 0x94)
    
    if (r0_8 != 0)
        *(r0_8 + 0xc) = r1_7
    
    *(arg1 + 0x94) = r1_7 - r4_1

if (zx.d(*(r5 + 0xc4)) != 0)
    void* r0_12 = core::CWorldBase::AddRollbackData(r10, r9, &__elf_program_headers[7].type:3)
    int32_t r1_9 = *(arg1 + 0x98)
    
    if (r0_12 != 0)
        *(r0_12 + 0xc) = r1_9
    
    *(arg1 + 0x98) = r1_9 - 1

int32_t var_28_1 = 0
return ascension::CWorld::OutputEvent(r10, 0x26, r9, zx.d(*(entry_r1 + 8)))
