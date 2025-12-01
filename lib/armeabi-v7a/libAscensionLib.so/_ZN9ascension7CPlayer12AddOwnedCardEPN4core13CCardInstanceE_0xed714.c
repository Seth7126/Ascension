// 函数: _ZN9ascension7CPlayer12AddOwnedCardEPN4core13CCardInstanceE
// 地址: 0xed714
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r10 = *(arg1 + 4)
uint32_t r9 = zx.d(*(arg1 + 8))
core::CCardStack::AddCard(*(arg1 + 0x84))
void* r0_2 = core::CWorldBase::AddRollbackData(r10, r9, &__elf_program_headers[6].align:1)
void* entry_r1

if (r0_2 != 0)
    *(r0_2 + 0xc) = zx.d(*(entry_r1 + 8))

void* r7 = *(entry_r1 + 0xc)
int32_t r0_4 = *(r7 + 0x88) - 1

if (r0_4 u<= 5)
    void* r0_5 = arg1 + (r0_4 << 5)
    int96_t q0
    q0.d = *(r0_5 + 0xb8)
    q0:8.d = *(r0_5 + 0xbc)
    int96_t q1
    q1.d = *(r0_5 + 0xc0)
    q1:8.d = *(r0_5 + 0xc4)
    *(r0_5 + 0xb4) += 1
    q0.d = *(r7 + 0x168) f+ q0.d
    *(r0_5 + 0xb8) = q0.d
    q0.d = *(r7 + 0x16c)
    q0.d = q0.d f+ q0:8.d
    *(r0_5 + 0xbc) = q0.d
    q0.d = *(r7 + 0x170)
    int32_t r1_4 = *(r0_5 + 0xd0)
    q0.d = q0.d f+ q1.d
    *(r0_5 + 0xc0) = q0.d
    *(r0_5 + 0xd0) = r1_4 + *(r7 + 0x180)
    q0.d = *(r7 + 0x174)
    q0.d = q0.d f+ q1:8.d
    *(r0_5 + 0xc4) = q0.d
    q0.d = *(r0_5 + 0xc8)
    q0:8.d = *(r7 + 0x178)
    q0.d = q0:8.d f+ q0.d
    *(r0_5 + 0xc8) = q0.d
    q0.d = *(r0_5 + 0xcc)
    q0:8.d = *(r7 + 0x17c)
    q0.d = q0:8.d f+ q0.d
    *(r0_5 + 0xcc) = q0.d

int32_t r4 = *(r7 + 0xa4)

if (r4 s>= 1)
    void* r0_7 = core::CWorldBase::AddRollbackData(r10, r9, &__elf_program_headers[7].type:2)
    int32_t r1_7 = *(arg1 + 0x94)
    
    if (r0_7 != 0)
        *(r0_7 + 0xc) = r1_7
    
    *(arg1 + 0x94) = r1_7 + r4

if (zx.d(*(r7 + 0xc4)) != 0)
    void* r0_11 = core::CWorldBase::AddRollbackData(r10, r9, &__elf_program_headers[7].type:3)
    int32_t r1_9 = *(arg1 + 0x98)
    
    if (r0_11 != 0)
        *(r0_11 + 0xc) = r1_9
    
    *(arg1 + 0x98) = r1_9 + 1

int32_t var_28 = 0
return ascension::CWorld::OutputEvent(r10, 0x25, zx.d(*(arg1 + 8)), zx.d(*(entry_r1 + 8)))
